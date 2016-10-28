
$(function() {

  var player = 1;
  var table = $('table');
  var messages = $('.messages');
  var turn = $('.turn');
  displayNextPlayer(turn, player);

  $('.reset').click(function() {
     messages.html('');
     player = 1;
     reset(table);
     displayNextPlayer(turn, player);
   });

  $('td').click(function() {
    td = $(this);

    var state = getState(td);
    if(!state) {
      var pattern = definePatternForCurrentPlayer(player);
      changeState(td, pattern);
      player = setNextPlayer(player);
      }

    $.ajax({
        type: 'POST',
        url: '/insertAt',
        data: "id=" + td.attr('id')
    }).done(function(result) {

        displayNextPlayer(turn, player);

        $.ajax({
            type: 'POST',
            url: '/checkWinner',
            data: null
        }).done(function(result) {
            if (result == 'X' || result == 'O') {
              messages.html(result + " just won the game. ");
              $('.turn').html('');
            }
            else if (result == '+') {
              messages.html('Draw!');
              $('.turn').html('');
            }

        }).fail(function(f) {
        });

    }).fail(function(f) {
    });
  });

});

function getState(td) {
  if(td.hasClass('cross') || td.hasClass('circle'))return 1;
  else return 0;
}

function changeState(td, pattern) {
  return td.addClass(pattern);
}

function definePatternForCurrentPlayer(player) {
  if(player == 1) {
    return 'cross';
  } else {
    return 'circle';
  }
}

function setNextPlayer(player) {
  if(player == 1) return player = 2;
  else return player = 1;
}

function displayNextPlayer(turn, player) {

  $.ajax({
      type: 'POST',
      url: '/getPlayer',
      data: null
  }).done(function(result) {
      $('.turn').html(result + ' make your move.');
  }).fail(function(f) {
    $('.turn').html(f);
  });
}
function reset(table) {
  table.find('td').each(function() {
    $(this).removeClass('circle').removeClass('cross');
  });

  $.ajax({
      type: 'POST',
      url: '/reset',
      data: null
  }).done(function(result) {
  }).fail(function(f) {
  });
}


$(function() {

  var playerX = true;
  var table = $('table');
  var info = $('.info');
  var turn = $('.turn');
  displayNextPlayer();

  //new game
  $('.new').click(function() {
     info.html('');
     playerX = true;
     reset(table);
     displayNextPlayer();
   });

  //cell clicked
  $('td').click(function() {

    td = $(this);

    if(!getInfoForCell(td)) {
      td.addClass(inputForPlayer(playerX))
      playerX = switchPlayer(playerX);
    }

    $.ajax({
        type: 'POST',
        url: '/insertAt',
        data: "id=" + td.attr('id')
    }).done(function(result) {

        displayNextPlayer();

        $.ajax({
            type: 'POST',
            url: '/checkWinner',
            data: null
        }).done(function(result) {

            if (result == 'X' || result == 'O') {
              info.html(result + " just won the game. ");
              turn.html("");
            }
            else if (result == '+') {
              info.html('Draw!');
              turn.html("");
            }

        }).fail(function(f) {
        });

    }).fail(function(f) {
    });
  });
});

function getInfoForCell(td) {
  if(td.hasClass('X') || td.hasClass('O')) return true;
  else return false;
}

function inputForPlayer(playerX) {
  if(playerX == true) return 'X';
  else return 'O';
}

function switchPlayer(playerX) {
  return playerX = !playerX;
}

function displayNextPlayer() {

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

//reset the ui and business logic
function reset(table) {
  table.find('td').each(function() {
    $(this).removeClass('X').removeClass('O');
  });

  $.ajax({
      type: 'POST',
      url: '/reset',
      data: null
  }).done(function(result) {
  }).fail(function(f) {
  });
}

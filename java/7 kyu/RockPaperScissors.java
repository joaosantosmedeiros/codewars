public class RockPaperScissors {
  
  public static String rpsls(String player1, String player2){
    if(player1 == "scissors"){
      if(player2 == "paper"){
        return "Player 1 Won!";
      }
      if(player2 == "rock"){
        return "Player 2 Won!";
      }
      if(player2 == "lizard"){
        return "Player 1 Won!";
      }
      if(player2 == "spock"){
        return "Player 2 Won!";
      }
      return "Draw!";
    }
    if(player1 == "paper"){
      if(player2 == "rock"){
        return "Player 1 Won!";
      }
      if(player2 == "lizard"){
        return "Player 2 Won!";
      }
      if(player2 == "spock"){
        return "Player 1 Won!";
      }
      if(player2 == "scissors"){
        return "Player 2 Won!";
      }
      return "Draw!";
    }
    if(player1 == "rock"){
      if(player2 == "lizard"){
        return "Player 1 Won!";
      }
      if(player2 == "spock"){
        return "Player 2 Won!";
      }
      if(player2 == "scissors"){
        return "Player 1 Won!";
      }
      if(player2 == "paper"){
        return "Player 2 Won!";
      }
      return "Draw!";
    }
    if(player1 == "lizard"){
      if(player2 == "spock"){
        return "Player 1 Won!";
      }
      if(player2 == "scissors"){
        return "Player 2 Won!";
      }
      if(player2 == "paper"){
        return "Player 1 Won!";
      }
      if(player2 == "rock"){
        return "Player 2 Won!";
      }
      return "Draw!";
    }
    if(player1 == "spock"){
      if(player2 == "scissors"){
        return "Player 1 Won!";
      }
      if(player2 == "paper"){
        return "Player 2 Won!";
      }
      if(player2 == "rock"){
        return "Player 1 Won!";
      }
      if(player2 == "lizard"){
        return "Player 2 Won!";
      }
      return "Draw!";
    }
    return "Draw!";
  }
}
//https://www.codewars.com/kata/5672a98bdbdd995fad00000f
enum tool {ROCK, PAPER, SCISSORS};
enum outcome {P1_WON, P2_WON, DRAW};

enum outcome rps (enum tool p1, enum tool p2)
{
  if(p1 == ROCK) {
    switch(p2) {
        case PAPER: return P2_WON;
        case SCISSORS: return P1_WON;
        default: break;
    }
  }
  if(p1 == PAPER) {
    switch(p2) {
        case ROCK: return P1_WON;
        case SCISSORS: return P2_WON;
        default: break;
    }
  }
  if(p1 == SCISSORS) {
    switch(p2) {
        case ROCK: return P2_WON;
        case PAPER: return P1_WON;
        default: break;
    }
  }
  return DRAW;
}

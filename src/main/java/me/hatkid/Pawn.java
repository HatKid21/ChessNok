package me.hatkid;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends AbstractPiece {

  public Pawn(Color team, Pos pos) {
    super(team, pos);
  }

  @Override
  public List<Pos> getAvailableMoves() {
    List<Pos> moves = new ArrayList<>();
    return moves;
  }

}

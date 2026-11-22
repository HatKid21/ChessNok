package me.hatkid;

import java.util.List;

public class Rook extends AbstractPiece {

  public Rook(Color team, Pos pos) {
    super(team, pos);
  }

  @Override
  public List<Pos> getAvailableMoves() {
    return null;
  }

}

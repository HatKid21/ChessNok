package me.hatkid;

import java.util.List;

public class Bishop extends AbstractPiece {

  public Bishop(Color team, Pos pos) {
    super(team, pos);
  }

  @Override
  public List<Pos> getAvailableMoves() {
    return null;
  }

}

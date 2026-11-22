package me.hatkid;

import java.util.List;

public class Queen extends AbstractPiece {

  public Queen(Color team, Pos pos) {
    super(team, pos);
  }

  @Override
  public List<Pos> getAvailableMoves() {
    return null;
  }

}

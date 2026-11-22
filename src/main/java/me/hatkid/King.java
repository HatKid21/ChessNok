package me.hatkid;

import java.util.List;

public class King extends AbstractPiece {

  public King(Color team, Pos pos) {
    super(team, pos);
  }

  @Override
  public List<Pos> getAvailableMoves() {
    return null;
  }

}

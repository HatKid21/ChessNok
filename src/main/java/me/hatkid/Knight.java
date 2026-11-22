package me.hatkid;

import java.util.List;

public class Knight extends AbstractPiece {

  public Knight(Color team, Pos pos) {
    super(team, pos);
  }

  @Override
  public List<Pos> getAvailableMoves() {
    return null;
  }

}

package me.hatkid.pieces;

import me.hatkid.util.*;

public abstract class AbstractPiece implements Piece {

  protected final Color team;
  protected Pos pos;

  AbstractPiece(Color team, Pos pos) {
    this.team = team;
    this.pos = pos;
  }

  @Override
  public Color getTeam() {
    return team;
  }

  @Override
  public int getX() {
    return pos.x();
  }

  @Override
  public int getY() {
    return pos.y();
  }

  @Override
  public Pos getPos() {
    return pos;
  }

}

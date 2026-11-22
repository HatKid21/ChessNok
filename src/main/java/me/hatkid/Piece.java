package me.hatkid;

import java.util.List;

public interface Piece {

  Color getTeam();

  int getX();

  int getY();

  Pos getPos();

  List<Pos> getAvailableMoves();

}

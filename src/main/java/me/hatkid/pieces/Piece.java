package me.hatkid.pieces;

import me.hatkid.util.*;
import me.hatkid.map.*;

import java.util.List;

public interface Piece {

  Color getTeam();

  int getX();

  int getY();

  Pos getPos();

  List<Pos> getAvailableMoves(Board board);

}

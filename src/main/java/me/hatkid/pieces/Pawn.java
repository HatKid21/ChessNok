package me.hatkid.pieces;

import java.util.ArrayList;
import java.util.List;

import me.hatkid.map.Board;
import me.hatkid.util.Color;
import me.hatkid.util.Pos;

public class Pawn extends AbstractPiece {

  private final int ortDir;

  public Pawn(Color team, Pos pos) {
    super(team, pos);
    ortDir = team == Color.BLACK ? -1 : 1;
  }

  @Override
  public List<Pos> getAvailableMoves(Board board) {
    List<Pos> moves = new ArrayList<>();

    if (board.getCell(pos.x(), pos.y() + ortDir).isEmpty()) {
      moves.add(new Pos(pos.x(), pos.y() + ortDir));
    }
    for (int i : List.of(-1, 1)) {
      Pos newPos = new Pos(pos.x() + i, pos.y() + ortDir);
      if (board.getCell(newPos) != null && !board.getCell(newPos).isEmpty()) {
        if (board.getCell(newPos).getPiece().getTeam() != team) {
          moves.add(newPos);
        }
      }
    }

    return moves;
  }

}

package me.hatkid.pieces;

import java.util.ArrayList;
import java.util.List;

import me.hatkid.map.Board;
import me.hatkid.map.Cell;
import me.hatkid.util.Color;
import me.hatkid.util.Pos;

public class Queen extends AbstractPiece {

  private static final Pos[] DIRS = {
      new Pos(1, 0),
      new Pos(-1, 0),
      new Pos(0, 1),
      new Pos(0, -1),
      new Pos(1, 1),
      new Pos(1, -1),
      new Pos(-1, 1),
      new Pos(-1, -1),
  };

  public Queen(Color team, Pos pos) {
    super(team, pos);
  }

  @Override
  public List<Pos> getAvailableMoves(Board board) {
    List<Pos> moves = new ArrayList<>();
    Pos checkPos;

    for (Pos dir : DIRS) {
      for (int i = 1; i < 8; i++) {
        checkPos = pos.add(dir.mult(i));
        Cell checkCell = board.getCell(checkPos);
        if (checkCell == null) {
          break;
        }
        if (checkCell.isEmpty()) {
          moves.add(checkPos);
        }
        if (!checkCell.isEmpty()) {
          if (checkCell.getPiece().getTeam() != team) {
            moves.add(checkPos);
          }
          break;
        }
      }
    }

    return moves;

  }

}

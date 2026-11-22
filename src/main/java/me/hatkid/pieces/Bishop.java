package me.hatkid.pieces;

import me.hatkid.map.*;
import me.hatkid.util.*;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends AbstractPiece {

  private static final Pos[] DIRS = {
      new Pos(1, 1),
      new Pos(1, -1),
      new Pos(-1, 1),
      new Pos(-1, -1)
  };

  public Bishop(Color team, Pos pos) {
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

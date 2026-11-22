package me.hatkid;

import java.util.ArrayList;
import java.util.List;

public class Rook extends AbstractPiece {

  private static final Pos[] DIRS = {
      new Pos(1, 0),
      new Pos(-1, 0),
      new Pos(0, 1),
      new Pos(0, -1)
  };

  public Rook(Color team, Pos pos) {
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
        if (checkCell != null && checkCell.isEmpty()) {
          moves.add(checkPos);
        }
        if (checkCell != null && !checkCell.isEmpty()) {
          if (checkCell.getPiece().getTeam() != team) {
            moves.add(checkPos);
          }
          break;
        }
        if (checkCell == null) {
          break;
        }
      }
    }

    return moves;
  }

}

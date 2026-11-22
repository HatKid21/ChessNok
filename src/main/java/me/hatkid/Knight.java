package me.hatkid;

import java.util.ArrayList;
import java.util.List;

public class Knight extends AbstractPiece {

  private static final Pos[] DIRS = {
      new Pos(2, 1),
      new Pos(2, -1),

      new Pos(-2, 1),
      new Pos(-2, -1),

      new Pos(1, 2),
      new Pos(1, -2),

      new Pos(-1, 2),
      new Pos(-1, -2),
  };

  public Knight(Color team, Pos pos) {
    super(team, pos);
  }

  @Override
  public List<Pos> getAvailableMoves(Board board) {
    List<Pos> moves = new ArrayList<>();
    Pos checkPos;

    for (Pos dir : DIRS) {
      checkPos = pos.add(dir);
      Cell checkCell = board.getCell(checkPos);
      if (checkCell == null) {
        continue;
      }
      if (checkCell.isEmpty()) {
        moves.add(checkPos);
      } else {
        if (checkCell.getPiece().getTeam() != team) {
          moves.add(checkPos);
        }
      }
    }

    return moves;
  }
}

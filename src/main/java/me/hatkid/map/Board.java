package me.hatkid.map;

import java.util.List;

import me.hatkid.util.*;
import me.hatkid.pieces.Bishop;
import me.hatkid.pieces.King;
import me.hatkid.pieces.Knight;
import me.hatkid.pieces.Pawn;
import me.hatkid.pieces.Queen;
import me.hatkid.pieces.Rook;

public class Board {

  private final Cell[][] cells;

  public Board() {
    cells = new Cell[8][8];
    initBoard();
    setupPieces();
  }

  private void initBoard() {
    for (int i = 0; i < cells.length; i++) {
      for (int j = 0; j < cells[0].length; j++) {
        Color cellColor = (i + j) % 2 != 0 ? Color.WHITE : Color.BLACK;
        cells[i][j] = new Cell(new Pos(j + 1, i + 1), cellColor);
        System.out.println(cells[i][j].toString());
      }
    }
  }

  public Cell getCell(Pos pos) {
    return getCell(pos.x(), pos.y());
  }

  public Cell getCell(int x, int y) {
    if (x < 1 || x > 8 || y < 1 || y > 8) {
      return null;
    }
    return cells[y - 1][x - 1];
  }

  public void check() {
    for (int i = 0; i < cells.length; i++) {
      for (int j = 0; j < cells[0].length; j++) {
        Cell cell = cells[i][j];
        if (!cell.isEmpty()) {
          System.out.println(cell.toString() + " : " + cell.getPiece() + " " + cell.getPos());

          System.out.println(cell.getPiece().getTeam() + " " + cell.getPiece().getAvailableMoves(this));
        }
      }
    }
  }

  private void setupPieces() {
    // Pawns
    for (int i : List.of(2, 7)) {
      for (int j = 0; j < cells[0].length; j++) {
        Cell cell = cells[i - 1][j];
        Color color = i % 2 == 0 ? Color.WHITE : Color.BLACK;
        cell.setPiece(new Pawn(color, cell.getPos()));
      }
    }

    // Rooks
    for (int i : List.of(1, 8)) {
      for (int j : List.of(1, 8)) {
        Color color = i == 1 ? Color.WHITE : Color.BLACK;
        Cell cell = cells[i - 1][j - 1];
        cell.setPiece(new Rook(color, cell.getPos()));
      }
    }

    // Knights
    for (int i : List.of(1, 8)) {
      for (int j : List.of(2, 7)) {
        Color color = i == 1 ? Color.WHITE : Color.BLACK;
        Cell cell = cells[i - 1][j - 1];
        cell.setPiece(new Knight(color, cell.getPos()));
      }
    }

    // Bishops
    for (int i : List.of(1, 8)) {
      for (int j : List.of(3, 6)) {
        Color color = i == 1 ? Color.WHITE : Color.BLACK;
        Cell cell = cells[i - 1][j - 1];
        cell.setPiece(new Bishop(color, cell.getPos()));
      }
    }

    // Queens
    for (int i : List.of(1, 8)) {
      Color color = i == 1 ? Color.WHITE : Color.BLACK;
      Cell cell = cells[i - 1][3];
      cell.setPiece(new Queen(color, cell.getPos()));
    }

    // Kings
    for (int i : List.of(1, 8)) {
      Color color = i == 1 ? Color.WHITE : Color.BLACK;
      Cell cell = cells[i - 1][4];
      cell.setPiece(new King(color, cell.getPos()));
    }

  }

}

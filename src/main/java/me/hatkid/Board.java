package me.hatkid;

import java.util.List;

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
        Color cellColor = (i + j) % 2 == 0 ? Color.WHITE : Color.BLACK;
        cells[i][j] = new Cell(new Pos(j + 1, 8 - i), cellColor);
        System.out.println(cells[i][j].toString());
      }
    }
  }

  public void check() {
    for (int i = 0; i < cells.length; i++) {
      for (int j = 0; j < cells[0].length; j++) {
        Cell cell = cells[i][j];
        System.out.println(cell.toString() + " : " + cell.getPiece());
      }
    }
  }

  private void setupPieces() {
    // Pawns
    for (int i : List.of(2, 7)) {
      for (int j = 0; j < cells[0].length; j++) {
        Cell cell = cells[8 - i][j];
        Color color = i % 2 == 0 ? Color.WHITE : Color.BLACK;
        cell.setPiece(new Pawn(color, cell.getPos()));
      }
    }

    // Rooks
    for (int i : List.of(1, 8)) {
      for (int j : List.of(1, 8)) {
        Color color = i == 1 ? Color.WHITE : Color.BLACK;
        Cell cell = cells[8 - i][8 - j];
        cell.setPiece(new Rook(color, cell.getPos()));
      }
    }

    // Knights
    for (int i : List.of(1, 8)) {
      for (int j : List.of(2, 7)) {
        Color color = i == 1 ? Color.WHITE : Color.BLACK;
        Cell cell = cells[8 - i][8 - j];
        cell.setPiece(new Knight(color, cell.getPos()));
      }
    }

    // Bishops
    for (int i : List.of(1, 8)) {
      for (int j : List.of(3, 6)) {
        Color color = i == 1 ? Color.WHITE : Color.BLACK;
        Cell cell = cells[8 - i][8 - j];
        cell.setPiece(new Bishop(color, cell.getPos()));
      }
    }

    // Queens
    for (int i : List.of(1, 8)) {
      Color color = i == 1 ? Color.WHITE : Color.BLACK;
      Cell cell = cells[8 - i][3];
      cell.setPiece(new Queen(color, cell.getPos()));
    }

    // Kings
    for (int i : List.of(1, 8)) {
      Color color = i == 1 ? Color.WHITE : Color.BLACK;
      Cell cell = cells[8 - i][4];
      cell.setPiece(new King(color, cell.getPos()));
    }

  }

}

package me.hatkid;

public class Cell {

  private static final String FIRST_COORD_MAP = "abcdefgh";

  private Pos pos;
  private final String strRepresentative;
  private Color color;
  private Piece piece;

  public Cell(Pos pos, Color color) {
    this.pos = pos;
    this.color = color;
    strRepresentative = FIRST_COORD_MAP.charAt(pos.x() - 1) + String.valueOf(pos.y());
  }

  public String toString() {
    return strRepresentative;
  }

  public Piece getPiece() {
    return piece;
  }

  public Pos getPos() {
    return pos;
  }

  public Color getColor() {
    return color;
  }

  public Piece setPiece(Piece piece) {
    Piece prev = this.piece;
    this.piece = piece;
    return prev;
  }

}

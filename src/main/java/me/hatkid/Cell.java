package me.hatkid;

public class Cell {

  private Pos pos;
  private Color color;
  private Piece piece;

  public Cell(Pos pos, Color color) {
    this.pos = pos;
    this.color = color;
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

}

public class Player {
  Vector2 position;
  Vector2 velocity;

public Player() {
  position = Vector2.Zero();
  velocity = Vector2.Zero();
}

public void logData() {
  System.out.println("Position - x: " + position.x + ", y: " + position.y);
  System.out.println("Velocity - x: " + velocity.x + ", y: " + velocity.y);
}
}

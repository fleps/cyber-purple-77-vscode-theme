class Hacker {
  private String location;
  private int birthDate;
  private int deathDate;
  private String[] weaknesses;

  public Hacker(String location, int birthDate, int deathDate, String[] weaknesses) {
    this.location = location;
    this.birthDate = birthDate;
    this.deathDate = deathDate;
    this.weaknesses = weaknesses;
  }

  public int getAge() {
    return this.calcAge();
  }

  public int calcAge() {
    return this.deathDate - this.birthDate;
  }
}

// ...there was a guy named Neo
public class cyberpunk {
  Hacker hacker = new Hacker(
      "Tokyo",
      1990,
      2090,
      new String[] { "Cops", "Government" });
}


@Override
public void run() {
    final double TARGET_FRAMES_PER_SECOND = 60.0;
    final double TARGET_UPDATES_PER_SECOND = 30.0;
    final double NANOSECONDS_PER_SECOND = 1000000000.0;

    double targetNanosecondsPerFrame = NANOSECONDS_PER_SECOND / TARGET_FRAMES_PER_SECOND;
    double targetNanosecondsPerUpdate = NANOSECONDS_PER_SECOND / TARGET_UPDATES_PER_SECOND;

    long lastUpdateTime = System.nanoTime();
    long lastFrameTime = lastUpdateTime;
    int frames = 0;
    int updates = 0;

    while (true) {
        long currentTime = System.nanoTime();
        double deltaTimeUpdate = (currentTime - lastUpdateTime) / targetNanosecondsPerUpdate;
        double deltaTimeFrame = (currentTime - lastFrameTime) / targetNanosecondsPerFrame;

        lastUpdateTime = currentTime;

        while (deltaTimeUpdate >= 1) {
            update();
            updates++;
            deltaTimeUpdate--;
        }

        if (deltaTimeFrame >= 1) {
            gamePane.repaint();
            frames++;
            deltaTimeFrame--;
        }

        if (System.currentTimeMillis() - lastUpdateTime >= 1000) {
            System.out.println("FPS: " + frames + ", UPS: " + updates);
            frames = 0;
            updates = 0;
            lastUpdateTime += 1000;
        }
    }
}

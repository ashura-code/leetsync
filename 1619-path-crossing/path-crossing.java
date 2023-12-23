import java.util.HashSet;
import java.util.Set;

class Pair {
    int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return x == pair.x && y == pair.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

class Solution {
    public boolean isPathCrossing(String path) {
        Set<Pair> visited = new HashSet<>();
        visited.add(new Pair(0, 0));

        int x = 0;
        int y = 0;

        for (char dir : path.toCharArray()) {
            if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'S') {
                y--;
            }

            Pair currentPos = new Pair(x, y);

            if (visited.contains(currentPos)) {
                return true;
            } else {
                visited.add(currentPos);
            }
        }

        return false;
    }
}

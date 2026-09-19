class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        // find nearest point between circle and square and compare with radius
        // we have all coordinate of rectangle so just find nearest point from circle and compare with radius
        int xmin = Math.max(x1, Math.min(xCenter, x2));
        int ymin = Math.max(y1, Math.min(yCenter, y2));

        long dx = xmin - xCenter;
        long dy = ymin - yCenter;

        return dx*dx + dy*dy <= (long) radius*radius;


    }
}
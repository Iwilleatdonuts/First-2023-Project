public class ThetaCalculator {
    public static void main(String[] args) {
        double robotXPose = 0;
        double robotYPose = 9;
        double targetXPose = 0;
        double targetYPose = 0;

        double deltaY = robotYPose - targetYPose;
        double deltaX = robotXPose - targetXPose;

        double angle;

        Zones curZone;

        if (deltaY < 0 && deltaX < 0) {
            curZone = Zones.QUADRANT_1;
        } else if (deltaY < 0 && deltaX > 0) {
            curZone = Zones.QUADRANT_2;
        } else if (deltaY > 0 && deltaX > 0) {
            curZone = Zones.QUADRANT_3;
        } else if (deltaY > 0 && deltaX < 0) {
            curZone = Zones.QUADRANT_4;
        } else if (deltaY == 0 && deltaX > 0) {
            curZone = Zones.POS_X_AXIS;
        } else if (deltaY == 0 && deltaX < 0) {
            curZone = Zones.NEG_X_AXIS;
        } else if (deltaY > 0 && deltaX == 0) {
            curZone = Zones.POS_Y_AXIS;
        } else if (deltaY < 0 && deltaX == 0) {
            curZone = Zones.NEG_Y_AXIS;
        } else {
            curZone = Zones.AT_TARGET;
        }

        switch (curZone) {
            case QUADRANT_1:
                angle = Math.toDegrees(Math.atan(deltaY / deltaX));
                break;
            case QUADRANT_2:
                angle = Math.toDegrees(Math.atan(deltaX / -deltaY)) + 90;
                break;
            case QUADRANT_3:
                angle = Math.toDegrees(Math.atan(deltaY / deltaX)) + 180;
                break;
            case QUADRANT_4:
                angle = Math.toDegrees(Math.atan(-deltaX / deltaY)) + 270;
                break;
            case NEG_X_AXIS:
                angle = 0;
                break;
            case NEG_Y_AXIS:
                angle = 90;
                break;
            case POS_X_AXIS:
                angle = 180;
                break;
            case POS_Y_AXIS:
                angle = 270;
                break;
            default:
                angle = 0;
                break;
        }

        System.out.println(angle);
    }

    public enum Zones {
        QUADRANT_1,
        QUADRANT_2,
        QUADRANT_3,
        QUADRANT_4,
        POS_X_AXIS,
        NEG_X_AXIS,
        POS_Y_AXIS,
        NEG_Y_AXIS,
        AT_TARGET
    }
}

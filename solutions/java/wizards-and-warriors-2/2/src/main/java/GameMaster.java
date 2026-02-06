public class GameMaster {

    public static String describe(Character character){
        return String.format("You're a level %d %s with %d hit points.",
            character.getLevel(),
            character.getCharacterClass(),
            character.getHitPoints()
        );
    }

    public static String describe(Destination destination){
        return String.format("You've arrived at %s, which has %d inhabitants.",
        destination.getName(),
        destination.getInhabitants());
    }

    public static String describe(TravelMethod method){
        switch (method) {
            case TravelMethod.WALKING:
                return "You're traveling to your destination by walking.";
            case TravelMethod.HORSEBACK:
                return "You're traveling to your destination on horseback.";
            default:
                throw new IllegalArgumentException();
        }
    }

    public static String describe(Character character, Destination destination, TravelMethod method){
        return describe(character) +" "+ describe(method) +" "+ describe(destination);
    }

    public static String describe(Character character, Destination destination){
        return describe(character) +" "+describe(TravelMethod.WALKING) +" "+ describe(destination);
    }
}

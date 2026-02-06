import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> cardsSet = new HashSet<>(cards);
        return cardsSet;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !(myCollection.containsAll(theirCollection) || theirCollection.containsAll(myCollection)) && (!theirCollection.isEmpty() || !myCollection.isEmpty());
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> cardSet = new HashSet<>(collections.get(0));
        for(int i = 0; i < collections.size(); i++){
            cardSet.retainAll(collections.get(i));
        }

        return cardSet;

    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> cardSet = new HashSet<>(collections.get(0));
        for(int i = 0; i < collections.size(); i++){
            cardSet.addAll(collections.get(i));
        }
        return cardSet;
    }
}

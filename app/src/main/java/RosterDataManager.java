public interface RosterDataManager {
    public Player getPlayer(int ID);
    public boolean addPlayer(Player player);
    public Roster getRoster();
    public void updatePlayer(int ID, String name, String position, int playerNumber);
    public boolean deletePlayer(int ID);
    public boolean addPlayerStats(Player player);
    public void updatePlayerStats(int playerID, int threePointersMade, int threePointersAttempted, int freeThrowsMade, int freeThrowsAttempted);
    public Player getPlayerStats(int playerID);
}

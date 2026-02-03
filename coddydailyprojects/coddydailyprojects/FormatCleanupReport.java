package coddydailyprojects;
/* 
Write a function formatCleanupReport that takes zones and returns a formatted cleanup report string.

The function processes cleanup zones by reversing the order of zones and calculating total debris for each zone.

Parameters:
- zones (int[][]): 2D array where each row represents a cleanup zone with debris counts

Returns: Formatted string with zones in reverse order. 

Format: 

Zone 1: 15 items
Zone 2: 8 items
Zone 3: 12 items

*/


class FormatCleanupReport {
    public static String formatCleanupReport(int[][] zones) {
        StringBuilder report = new StringBuilder();
        
        // Process zones in reverse order
        for (int i = zones.length - 1; i >= 0; i--) {
            int totalDebris = 0;
            
            // Calculate total debris for current zone
            for (int debris : zones[i]) {
                totalDebris += debris;
            }
            
            // Add zone info to report
            int zoneNumber = zones.length - i;
            report.append("Zone ").append(zoneNumber).append(": ").append(totalDebris).append(" items");
            
            // Add newline if not the last zone
            if (i > 0) {
                report.append("\n");
            }
        }
        
        return report.toString();
    }
}
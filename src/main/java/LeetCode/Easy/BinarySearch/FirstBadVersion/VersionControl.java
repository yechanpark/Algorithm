package LeetCode.Easy.BinarySearch.FirstBadVersion;

import java.util.ArrayList;
import java.util.List;

public class VersionControl {
    private List<Integer> badVersionList = new ArrayList<>();

    public void addBadVersion(int badVersion) {
        badVersionList.add(badVersion);
    }

    public boolean isBadVersion(int version) {
        return badVersionList.contains(version);
    }
}

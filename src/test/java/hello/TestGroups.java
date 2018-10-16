package hello;

public final class TestGroups {

    /**
     * True unit tests. No interactions with database, no spring context, no http calls, etc.
     * We test single class and mock everything else.
     */
    public static final String UNIT = "UNIT";

    /**
     * Not to be run by continuous integration. Exist only as POC.
     */
    public static final String EXPLORATORY = "EXPLORATORY";

    public static final String CONTEXT_LOADING = "CONTEXT_LOADING";

    public static final String DIFFERENT_CONTEXT = "DIFFERENT_CONTEXT";

    private TestGroups() {
    }
}

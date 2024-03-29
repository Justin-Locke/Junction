package junction.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class IdUtils {
    private static final int MAX_ID_LENGTH = 8;

    private IdUtils() {

    }

    /**
     * A method to generate Ids for activities.
     * @return formatted Id.
     */
    public static String generateActivityId() {
        return "NV" + RandomStringUtils.randomAlphanumeric(MAX_ID_LENGTH);
    }

    /**
     * Method to Generate Ids for comments.
     * @return formatted Id.
     */
    public static String generateCommentId() {
        return "CM" + RandomStringUtils.randomAlphanumeric(MAX_ID_LENGTH) + "T";
    }
}

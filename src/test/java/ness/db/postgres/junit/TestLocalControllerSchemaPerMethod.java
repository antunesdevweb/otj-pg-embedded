package ness.db.postgres.junit;


import org.junit.Assert;
import org.junit.Rule;
import org.skife.jdbi.v2.DBI;

public class TestLocalControllerSchemaPerMethod extends AbstractControllerTests
{
    @Rule
    public final LocalPostgresControllerTestRule database = PostgresRules.schemaControllerRule("trumpet_test");

    @Override
    public DBI getDbi()
    {
        Assert.assertNotNull(database);
        final DBI dbi = database.getDbi();
        Assert.assertNotNull(dbi);
        return dbi;
    }
}
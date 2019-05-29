package by.yakovtsev.webapp.storage;


import by.yakovtsev.webapp.WebAppConfig;

public class SqlStorageTest extends AbstractStorageTest{
    {
        storage = WebAppConfig.get().getStorage();
    }

}
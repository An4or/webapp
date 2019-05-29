package by.yakovtsev.webapp.storage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayStorageTest extends AbstractStorageTest {
    {
        storage = new ArrayStorage();
    }
}
# reproduce multi-test-suite visibility bug

when adding an integration test suite, which includes classes in main and test, it works.

when adding a third test suite that depends on the other three modules, the test module is not visible.

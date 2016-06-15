var sse = require('./api/sse');

module.exports = {
    'default': {
        waitForConditionTimeout: 20000,
        beforeEach: function (browser, done) {
            sse.connect(browser, done);
        },
        afterEach: function () {
            sse.disconnect();
        }
    }
};
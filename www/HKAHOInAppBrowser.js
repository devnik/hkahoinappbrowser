var exec = require('cordova/exec');

exports.openWebview = function (arg0, success, error) {
    exec(success, error, 'HKAHOInAppBrowser', 'openWebview', [arg0]);
};

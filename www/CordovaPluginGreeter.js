var exec = require('cordova/exec');

exports.greet = function (name, success, error) {
    exec(success, error, 'CordovaPluginGreeter', 'greet', [name]);
};

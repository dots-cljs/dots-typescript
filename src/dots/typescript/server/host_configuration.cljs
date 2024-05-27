(ns dots.typescript.server.host-configuration)

(defn format-code-options
  "**Returns:** `FormatCodeSettings`"
  ^js [host-configuration]
  (.-formatCodeOptions ^js host-configuration))

(defn set-format-code-options!
  ^js [host-configuration value]
  (set! (.-formatCodeOptions ^js host-configuration) value))

(defn preferences
  "**Returns:** `UserPreferences`"
  ^js [host-configuration]
  (.-preferences ^js host-configuration))

(defn set-preferences!
  ^js [host-configuration value]
  (set! (.-preferences ^js host-configuration) value))

(defn host-info
  "**Returns:** `string`"
  ^js [host-configuration]
  (.-hostInfo ^js host-configuration))

(defn set-host-info!
  ^js [host-configuration value]
  (set! (.-hostInfo ^js host-configuration) value))

(defn extra-file-extensions
  "**Returns:** `FileExtensionInfo[] | undefined`"
  ^js [host-configuration]
  (.-extraFileExtensions ^js host-configuration))

(defn set-extra-file-extensions!
  ^js [host-configuration value]
  (set! (.-extraFileExtensions ^js host-configuration) value))

(defn watch-options
  "**Returns:** `WatchOptions | undefined`"
  ^js [host-configuration]
  (.-watchOptions ^js host-configuration))

(defn set-watch-options!
  ^js [host-configuration value]
  (set! (.-watchOptions ^js host-configuration) value))

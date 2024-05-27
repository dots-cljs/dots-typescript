(ns dots.typescript.server.protocol.configure-request-arguments
  "Information found in a configure request.")

(defn host-info
  "Information about the host, for example 'Emacs 24.4' or
   'Sublime Text version 3075'
   
   **Returns:** `string | undefined`"
  ^js [configure-request-arguments]
  (.-hostInfo ^js configure-request-arguments))

(defn set-host-info!
  "Information about the host, for example 'Emacs 24.4' or
   'Sublime Text version 3075'"
  ^js [configure-request-arguments value]
  (set! (.-hostInfo ^js configure-request-arguments) value))

(defn file
  "If present, tab settings apply only to this file.
   
   **Returns:** `string | undefined`"
  ^js [configure-request-arguments]
  (.-file ^js configure-request-arguments))

(defn set-file!
  "If present, tab settings apply only to this file."
  ^js [configure-request-arguments value]
  (set! (.-file ^js configure-request-arguments) value))

(defn format-options
  "The format options to use during formatting and other code editing features.
   
   **Returns:** `FormatCodeSettings | undefined`"
  ^js [configure-request-arguments]
  (.-formatOptions ^js configure-request-arguments))

(defn set-format-options!
  "The format options to use during formatting and other code editing features."
  ^js [configure-request-arguments value]
  (set! (.-formatOptions ^js configure-request-arguments) value))

(defn preferences
  "**Returns:** `UserPreferences | undefined`"
  ^js [configure-request-arguments]
  (.-preferences ^js configure-request-arguments))

(defn set-preferences!
  ^js [configure-request-arguments value]
  (set! (.-preferences ^js configure-request-arguments) value))

(defn extra-file-extensions
  "The host's additional supported .js file extensions
   
   **Returns:** `FileExtensionInfo[] | undefined`"
  ^js [configure-request-arguments]
  (.-extraFileExtensions ^js configure-request-arguments))

(defn set-extra-file-extensions!
  "The host's additional supported .js file extensions"
  ^js [configure-request-arguments value]
  (set! (.-extraFileExtensions ^js configure-request-arguments) value))

(defn watch-options
  "**Returns:** `WatchOptions | undefined`"
  ^js [configure-request-arguments]
  (.-watchOptions ^js configure-request-arguments))

(defn set-watch-options!
  ^js [configure-request-arguments value]
  (set! (.-watchOptions ^js configure-request-arguments) value))

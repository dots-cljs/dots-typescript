(ns dots.typescript.server.protocol.navto-request-args
  "Arguments for navto request message.")

(defn search-value
  "Search term to navigate to from current location; term can
   be '.*' or an identifier prefix."
  ^js [navto-request-args]
  (.-searchValue ^js navto-request-args))

(defn set-search-value!
  "Search term to navigate to from current location; term can
   be '.*' or an identifier prefix."
  ^js [navto-request-args value]
  (set! (.-searchValue ^js navto-request-args) value))

(defn max-result-count
  "Optional limit on the number of items to return."
  ^js [navto-request-args]
  (.-maxResultCount ^js navto-request-args))

(defn set-max-result-count!
  "Optional limit on the number of items to return."
  ^js [navto-request-args value]
  (set! (.-maxResultCount ^js navto-request-args) value))

(defn file
  "The file for the request (absolute pathname required)."
  ^js [navto-request-args]
  (.-file ^js navto-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [navto-request-args value]
  (set! (.-file ^js navto-request-args) value))

(defn current-file-only?
  "Optional flag to indicate we want results for just the current file
   or the entire project."
  ^js [navto-request-args]
  (.-currentFileOnly ^js navto-request-args))

(defn set-current-file-only!
  "Optional flag to indicate we want results for just the current file
   or the entire project."
  ^js [navto-request-args value]
  (set! (.-currentFileOnly ^js navto-request-args) value))

(defn project-file-name
  ^js [navto-request-args]
  (.-projectFileName ^js navto-request-args))

(defn set-project-file-name!
  ^js [navto-request-args value]
  (set! (.-projectFileName ^js navto-request-args) value))

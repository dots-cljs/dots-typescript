(ns dots.typescript.bundle)

(defn kind
  ^js [bundle]
  (.-kind ^js bundle))

(defn prepends
  ^js [bundle]
  (.-prepends ^js bundle))

(defn source-files
  ^js [bundle]
  (.-sourceFiles ^js bundle))

(defn flags
  ^js [bundle]
  (.-flags ^js bundle))

(defn parent
  ^js [bundle]
  (.-parent ^js bundle))

(defn source-file
  ^js [bundle]
  (.getSourceFile ^js bundle))

(defn child-count
  (^js [bundle]
   (.getChildCount ^js bundle))
  (^js [bundle source-file]
   (.getChildCount ^js bundle source-file)))

(defn child-at
  (^js [bundle index]
   (.getChildAt ^js bundle index))
  (^js [bundle index source-file]
   (.getChildAt ^js bundle index source-file)))

(defn children
  (^js [bundle]
   (.getChildren ^js bundle))
  (^js [bundle source-file]
   (.getChildren ^js bundle source-file)))

(defn start
  (^js [bundle]
   (.getStart ^js bundle))
  (^js [bundle source-file]
   (.getStart ^js bundle source-file))
  (^js [bundle source-file include-js-doc-comment?]
   (.getStart ^js bundle source-file include-js-doc-comment?)))

(defn full-start
  ^js [bundle]
  (.getFullStart ^js bundle))

(defn get-end
  ^js [bundle]
  (.getEnd ^js bundle))

(defn width
  (^js [bundle]
   (.getWidth ^js bundle))
  (^js [bundle source-file]
   (.getWidth ^js bundle source-file)))

(defn full-width
  ^js [bundle]
  (.getFullWidth ^js bundle))

(defn leading-trivia-width
  (^js [bundle]
   (.getLeadingTriviaWidth ^js bundle))
  (^js [bundle source-file]
   (.getLeadingTriviaWidth ^js bundle source-file)))

(defn full-text
  (^js [bundle]
   (.getFullText ^js bundle))
  (^js [bundle source-file]
   (.getFullText ^js bundle source-file)))

(defn text
  (^js [bundle]
   (.getText ^js bundle))
  (^js [bundle source-file]
   (.getText ^js bundle source-file)))

(defn first-token
  (^js [bundle]
   (.getFirstToken ^js bundle))
  (^js [bundle source-file]
   (.getFirstToken ^js bundle source-file)))

(defn last-token
  (^js [bundle]
   (.getLastToken ^js bundle))
  (^js [bundle source-file]
   (.getLastToken ^js bundle source-file)))

(defn for-each-child
  (^js [bundle cb-node]
   (.forEachChild ^js bundle cb-node))
  (^js [bundle cb-node cb-node-array]
   (.forEachChild ^js bundle cb-node cb-node-array)))

(defn decorators
  ^js [bundle]
  (.-decorators ^js bundle))

(defn modifiers
  ^js [bundle]
  (.-modifiers ^js bundle))

(defn pos
  ^js [bundle]
  (.-pos ^js bundle))

(defn end
  ^js [bundle]
  (.-end ^js bundle))

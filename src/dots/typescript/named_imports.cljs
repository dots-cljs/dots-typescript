(ns dots.typescript.named-imports)

(defn kind
  ^js [named-imports]
  (.-kind ^js named-imports))

(defn parent
  ^js [named-imports]
  (.-parent ^js named-imports))

(defn elements
  ^js [named-imports]
  (.-elements ^js named-imports))

(defn flags
  ^js [named-imports]
  (.-flags ^js named-imports))

(defn source-file
  ^js [named-imports]
  (.getSourceFile ^js named-imports))

(defn child-count
  (^js [named-imports]
   (.getChildCount ^js named-imports))
  (^js [named-imports source-file]
   (.getChildCount ^js named-imports source-file)))

(defn child-at
  (^js [named-imports index]
   (.getChildAt ^js named-imports index))
  (^js [named-imports index source-file]
   (.getChildAt ^js named-imports index source-file)))

(defn children
  (^js [named-imports]
   (.getChildren ^js named-imports))
  (^js [named-imports source-file]
   (.getChildren ^js named-imports source-file)))

(defn start
  (^js [named-imports]
   (.getStart ^js named-imports))
  (^js [named-imports source-file]
   (.getStart ^js named-imports source-file))
  (^js [named-imports source-file include-js-doc-comment?]
   (.getStart ^js named-imports source-file include-js-doc-comment?)))

(defn full-start
  ^js [named-imports]
  (.getFullStart ^js named-imports))

(defn get-end
  ^js [named-imports]
  (.getEnd ^js named-imports))

(defn width
  (^js [named-imports]
   (.getWidth ^js named-imports))
  (^js [named-imports source-file]
   (.getWidth ^js named-imports source-file)))

(defn full-width
  ^js [named-imports]
  (.getFullWidth ^js named-imports))

(defn leading-trivia-width
  (^js [named-imports]
   (.getLeadingTriviaWidth ^js named-imports))
  (^js [named-imports source-file]
   (.getLeadingTriviaWidth ^js named-imports source-file)))

(defn full-text
  (^js [named-imports]
   (.getFullText ^js named-imports))
  (^js [named-imports source-file]
   (.getFullText ^js named-imports source-file)))

(defn text
  (^js [named-imports]
   (.getText ^js named-imports))
  (^js [named-imports source-file]
   (.getText ^js named-imports source-file)))

(defn first-token
  (^js [named-imports]
   (.getFirstToken ^js named-imports))
  (^js [named-imports source-file]
   (.getFirstToken ^js named-imports source-file)))

(defn last-token
  (^js [named-imports]
   (.getLastToken ^js named-imports))
  (^js [named-imports source-file]
   (.getLastToken ^js named-imports source-file)))

(defn for-each-child
  (^js [named-imports cb-node]
   (.forEachChild ^js named-imports cb-node))
  (^js [named-imports cb-node cb-node-array]
   (.forEachChild ^js named-imports cb-node cb-node-array)))

(defn pos
  ^js [named-imports]
  (.-pos ^js named-imports))

(defn end
  ^js [named-imports]
  (.-end ^js named-imports))

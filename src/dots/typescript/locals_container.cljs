(ns dots.typescript.locals-container)

(defn kind
  ^js [locals-container]
  (.-kind ^js locals-container))

(defn flags
  ^js [locals-container]
  (.-flags ^js locals-container))

(defn parent
  ^js [locals-container]
  (.-parent ^js locals-container))

(defn source-file
  ^js [locals-container]
  (.getSourceFile ^js locals-container))

(defn child-count
  (^js [locals-container]
   (.getChildCount ^js locals-container))
  (^js [locals-container source-file]
   (.getChildCount ^js locals-container source-file)))

(defn child-at
  (^js [locals-container index]
   (.getChildAt ^js locals-container index))
  (^js [locals-container index source-file]
   (.getChildAt ^js locals-container index source-file)))

(defn children
  (^js [locals-container]
   (.getChildren ^js locals-container))
  (^js [locals-container source-file]
   (.getChildren ^js locals-container source-file)))

(defn start
  (^js [locals-container]
   (.getStart ^js locals-container))
  (^js [locals-container source-file]
   (.getStart ^js locals-container source-file))
  (^js [locals-container source-file include-js-doc-comment?]
   (.getStart ^js locals-container source-file include-js-doc-comment?)))

(defn full-start
  ^js [locals-container]
  (.getFullStart ^js locals-container))

(defn get-end
  ^js [locals-container]
  (.getEnd ^js locals-container))

(defn width
  (^js [locals-container]
   (.getWidth ^js locals-container))
  (^js [locals-container source-file]
   (.getWidth ^js locals-container source-file)))

(defn full-width
  ^js [locals-container]
  (.getFullWidth ^js locals-container))

(defn leading-trivia-width
  (^js [locals-container]
   (.getLeadingTriviaWidth ^js locals-container))
  (^js [locals-container source-file]
   (.getLeadingTriviaWidth ^js locals-container source-file)))

(defn full-text
  (^js [locals-container]
   (.getFullText ^js locals-container))
  (^js [locals-container source-file]
   (.getFullText ^js locals-container source-file)))

(defn text
  (^js [locals-container]
   (.getText ^js locals-container))
  (^js [locals-container source-file]
   (.getText ^js locals-container source-file)))

(defn first-token
  (^js [locals-container]
   (.getFirstToken ^js locals-container))
  (^js [locals-container source-file]
   (.getFirstToken ^js locals-container source-file)))

(defn last-token
  (^js [locals-container]
   (.getLastToken ^js locals-container))
  (^js [locals-container source-file]
   (.getLastToken ^js locals-container source-file)))

(defn for-each-child
  (^js [locals-container cb-node]
   (.forEachChild ^js locals-container cb-node))
  (^js [locals-container cb-node cb-node-array]
   (.forEachChild ^js locals-container cb-node cb-node-array)))

(defn pos
  ^js [locals-container]
  (.-pos ^js locals-container))

(defn end
  ^js [locals-container]
  (.-end ^js locals-container))

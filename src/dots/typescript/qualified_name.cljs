(ns dots.typescript.qualified-name)

(defn kind
  ^js [qualified-name]
  (.-kind ^js qualified-name))

(defn left
  ^js [qualified-name]
  (.-left ^js qualified-name))

(defn right
  ^js [qualified-name]
  (.-right ^js qualified-name))

(defn flags
  ^js [qualified-name]
  (.-flags ^js qualified-name))

(defn parent
  ^js [qualified-name]
  (.-parent ^js qualified-name))

(defn source-file
  ^js [qualified-name]
  (.getSourceFile ^js qualified-name))

(defn child-count
  (^js [qualified-name]
   (.getChildCount ^js qualified-name))
  (^js [qualified-name source-file]
   (.getChildCount ^js qualified-name source-file)))

(defn child-at
  (^js [qualified-name index]
   (.getChildAt ^js qualified-name index))
  (^js [qualified-name index source-file]
   (.getChildAt ^js qualified-name index source-file)))

(defn children
  (^js [qualified-name]
   (.getChildren ^js qualified-name))
  (^js [qualified-name source-file]
   (.getChildren ^js qualified-name source-file)))

(defn start
  (^js [qualified-name]
   (.getStart ^js qualified-name))
  (^js [qualified-name source-file]
   (.getStart ^js qualified-name source-file))
  (^js [qualified-name source-file include-js-doc-comment?]
   (.getStart ^js qualified-name source-file include-js-doc-comment?)))

(defn full-start
  ^js [qualified-name]
  (.getFullStart ^js qualified-name))

(defn get-end
  ^js [qualified-name]
  (.getEnd ^js qualified-name))

(defn width
  (^js [qualified-name]
   (.getWidth ^js qualified-name))
  (^js [qualified-name source-file]
   (.getWidth ^js qualified-name source-file)))

(defn full-width
  ^js [qualified-name]
  (.getFullWidth ^js qualified-name))

(defn leading-trivia-width
  (^js [qualified-name]
   (.getLeadingTriviaWidth ^js qualified-name))
  (^js [qualified-name source-file]
   (.getLeadingTriviaWidth ^js qualified-name source-file)))

(defn full-text
  (^js [qualified-name]
   (.getFullText ^js qualified-name))
  (^js [qualified-name source-file]
   (.getFullText ^js qualified-name source-file)))

(defn text
  (^js [qualified-name]
   (.getText ^js qualified-name))
  (^js [qualified-name source-file]
   (.getText ^js qualified-name source-file)))

(defn first-token
  (^js [qualified-name]
   (.getFirstToken ^js qualified-name))
  (^js [qualified-name source-file]
   (.getFirstToken ^js qualified-name source-file)))

(defn last-token
  (^js [qualified-name]
   (.getLastToken ^js qualified-name))
  (^js [qualified-name source-file]
   (.getLastToken ^js qualified-name source-file)))

(defn for-each-child
  (^js [qualified-name cb-node]
   (.forEachChild ^js qualified-name cb-node))
  (^js [qualified-name cb-node cb-node-array]
   (.forEachChild ^js qualified-name cb-node cb-node-array)))

(defn pos
  ^js [qualified-name]
  (.-pos ^js qualified-name))

(defn end
  ^js [qualified-name]
  (.-end ^js qualified-name))

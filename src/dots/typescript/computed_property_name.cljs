(ns dots.typescript.computed-property-name)

(defn kind
  ^js [computed-property-name]
  (.-kind ^js computed-property-name))

(defn parent
  ^js [computed-property-name]
  (.-parent ^js computed-property-name))

(defn expression
  ^js [computed-property-name]
  (.-expression ^js computed-property-name))

(defn flags
  ^js [computed-property-name]
  (.-flags ^js computed-property-name))

(defn source-file
  ^js [computed-property-name]
  (.getSourceFile ^js computed-property-name))

(defn child-count
  (^js [computed-property-name]
   (.getChildCount ^js computed-property-name))
  (^js [computed-property-name source-file]
   (.getChildCount ^js computed-property-name source-file)))

(defn child-at
  (^js [computed-property-name index]
   (.getChildAt ^js computed-property-name index))
  (^js [computed-property-name index source-file]
   (.getChildAt ^js computed-property-name index source-file)))

(defn children
  (^js [computed-property-name]
   (.getChildren ^js computed-property-name))
  (^js [computed-property-name source-file]
   (.getChildren ^js computed-property-name source-file)))

(defn start
  (^js [computed-property-name]
   (.getStart ^js computed-property-name))
  (^js [computed-property-name source-file]
   (.getStart ^js computed-property-name source-file))
  (^js [computed-property-name source-file include-js-doc-comment?]
   (.getStart ^js computed-property-name source-file include-js-doc-comment?)))

(defn full-start
  ^js [computed-property-name]
  (.getFullStart ^js computed-property-name))

(defn get-end
  ^js [computed-property-name]
  (.getEnd ^js computed-property-name))

(defn width
  (^js [computed-property-name]
   (.getWidth ^js computed-property-name))
  (^js [computed-property-name source-file]
   (.getWidth ^js computed-property-name source-file)))

(defn full-width
  ^js [computed-property-name]
  (.getFullWidth ^js computed-property-name))

(defn leading-trivia-width
  (^js [computed-property-name]
   (.getLeadingTriviaWidth ^js computed-property-name))
  (^js [computed-property-name source-file]
   (.getLeadingTriviaWidth ^js computed-property-name source-file)))

(defn full-text
  (^js [computed-property-name]
   (.getFullText ^js computed-property-name))
  (^js [computed-property-name source-file]
   (.getFullText ^js computed-property-name source-file)))

(defn text
  (^js [computed-property-name]
   (.getText ^js computed-property-name))
  (^js [computed-property-name source-file]
   (.getText ^js computed-property-name source-file)))

(defn first-token
  (^js [computed-property-name]
   (.getFirstToken ^js computed-property-name))
  (^js [computed-property-name source-file]
   (.getFirstToken ^js computed-property-name source-file)))

(defn last-token
  (^js [computed-property-name]
   (.getLastToken ^js computed-property-name))
  (^js [computed-property-name source-file]
   (.getLastToken ^js computed-property-name source-file)))

(defn for-each-child
  (^js [computed-property-name cb-node]
   (.forEachChild ^js computed-property-name cb-node))
  (^js [computed-property-name cb-node cb-node-array]
   (.forEachChild ^js computed-property-name cb-node cb-node-array)))

(defn pos
  ^js [computed-property-name]
  (.-pos ^js computed-property-name))

(defn end
  ^js [computed-property-name]
  (.-end ^js computed-property-name))

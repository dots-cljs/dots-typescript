(ns dots.typescript.unparsed-prepend)

(defn kind
  ^js [unparsed-prepend]
  (.-kind ^js unparsed-prepend))

(defn parent
  ^js [unparsed-prepend]
  (.-parent ^js unparsed-prepend))

(defn data
  ^js [unparsed-prepend]
  (.-data ^js unparsed-prepend))

(defn texts
  ^js [unparsed-prepend]
  (.-texts ^js unparsed-prepend))

(defn flags
  ^js [unparsed-prepend]
  (.-flags ^js unparsed-prepend))

(defn source-file
  ^js [unparsed-prepend]
  (.getSourceFile ^js unparsed-prepend))

(defn child-count
  (^js [unparsed-prepend]
   (.getChildCount ^js unparsed-prepend))
  (^js [unparsed-prepend source-file]
   (.getChildCount ^js unparsed-prepend source-file)))

(defn child-at
  (^js [unparsed-prepend index]
   (.getChildAt ^js unparsed-prepend index))
  (^js [unparsed-prepend index source-file]
   (.getChildAt ^js unparsed-prepend index source-file)))

(defn children
  (^js [unparsed-prepend]
   (.getChildren ^js unparsed-prepend))
  (^js [unparsed-prepend source-file]
   (.getChildren ^js unparsed-prepend source-file)))

(defn start
  (^js [unparsed-prepend]
   (.getStart ^js unparsed-prepend))
  (^js [unparsed-prepend source-file]
   (.getStart ^js unparsed-prepend source-file))
  (^js [unparsed-prepend source-file include-js-doc-comment?]
   (.getStart ^js unparsed-prepend source-file include-js-doc-comment?)))

(defn full-start
  ^js [unparsed-prepend]
  (.getFullStart ^js unparsed-prepend))

(defn get-end
  ^js [unparsed-prepend]
  (.getEnd ^js unparsed-prepend))

(defn width
  (^js [unparsed-prepend]
   (.getWidth ^js unparsed-prepend))
  (^js [unparsed-prepend source-file]
   (.getWidth ^js unparsed-prepend source-file)))

(defn full-width
  ^js [unparsed-prepend]
  (.getFullWidth ^js unparsed-prepend))

(defn leading-trivia-width
  (^js [unparsed-prepend]
   (.getLeadingTriviaWidth ^js unparsed-prepend))
  (^js [unparsed-prepend source-file]
   (.getLeadingTriviaWidth ^js unparsed-prepend source-file)))

(defn full-text
  (^js [unparsed-prepend]
   (.getFullText ^js unparsed-prepend))
  (^js [unparsed-prepend source-file]
   (.getFullText ^js unparsed-prepend source-file)))

(defn text
  (^js [unparsed-prepend]
   (.getText ^js unparsed-prepend))
  (^js [unparsed-prepend source-file]
   (.getText ^js unparsed-prepend source-file)))

(defn first-token
  (^js [unparsed-prepend]
   (.getFirstToken ^js unparsed-prepend))
  (^js [unparsed-prepend source-file]
   (.getFirstToken ^js unparsed-prepend source-file)))

(defn last-token
  (^js [unparsed-prepend]
   (.getLastToken ^js unparsed-prepend))
  (^js [unparsed-prepend source-file]
   (.getLastToken ^js unparsed-prepend source-file)))

(defn for-each-child
  (^js [unparsed-prepend cb-node]
   (.forEachChild ^js unparsed-prepend cb-node))
  (^js [unparsed-prepend cb-node cb-node-array]
   (.forEachChild ^js unparsed-prepend cb-node cb-node-array)))

(defn pos
  ^js [unparsed-prepend]
  (.-pos ^js unparsed-prepend))

(defn end
  ^js [unparsed-prepend]
  (.-end ^js unparsed-prepend))

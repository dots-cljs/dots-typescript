(ns dots.typescript.indexed-access-type-node)

(defn kind
  ^js [indexed-access-type-node]
  (.-kind ^js indexed-access-type-node))

(defn object-type
  ^js [indexed-access-type-node]
  (.-objectType ^js indexed-access-type-node))

(defn index-type
  ^js [indexed-access-type-node]
  (.-indexType ^js indexed-access-type-node))

(defn flags
  ^js [indexed-access-type-node]
  (.-flags ^js indexed-access-type-node))

(defn parent
  ^js [indexed-access-type-node]
  (.-parent ^js indexed-access-type-node))

(defn source-file
  ^js [indexed-access-type-node]
  (.getSourceFile ^js indexed-access-type-node))

(defn child-count
  (^js [indexed-access-type-node]
   (.getChildCount ^js indexed-access-type-node))
  (^js [indexed-access-type-node source-file]
   (.getChildCount ^js indexed-access-type-node source-file)))

(defn child-at
  (^js [indexed-access-type-node index]
   (.getChildAt ^js indexed-access-type-node index))
  (^js [indexed-access-type-node index source-file]
   (.getChildAt ^js indexed-access-type-node index source-file)))

(defn children
  (^js [indexed-access-type-node]
   (.getChildren ^js indexed-access-type-node))
  (^js [indexed-access-type-node source-file]
   (.getChildren ^js indexed-access-type-node source-file)))

(defn start
  (^js [indexed-access-type-node]
   (.getStart ^js indexed-access-type-node))
  (^js [indexed-access-type-node source-file]
   (.getStart ^js indexed-access-type-node source-file))
  (^js [indexed-access-type-node source-file include-js-doc-comment?]
   (.getStart ^js indexed-access-type-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [indexed-access-type-node]
  (.getFullStart ^js indexed-access-type-node))

(defn get-end
  ^js [indexed-access-type-node]
  (.getEnd ^js indexed-access-type-node))

(defn width
  (^js [indexed-access-type-node]
   (.getWidth ^js indexed-access-type-node))
  (^js [indexed-access-type-node source-file]
   (.getWidth ^js indexed-access-type-node source-file)))

(defn full-width
  ^js [indexed-access-type-node]
  (.getFullWidth ^js indexed-access-type-node))

(defn leading-trivia-width
  (^js [indexed-access-type-node]
   (.getLeadingTriviaWidth ^js indexed-access-type-node))
  (^js [indexed-access-type-node source-file]
   (.getLeadingTriviaWidth ^js indexed-access-type-node source-file)))

(defn full-text
  (^js [indexed-access-type-node]
   (.getFullText ^js indexed-access-type-node))
  (^js [indexed-access-type-node source-file]
   (.getFullText ^js indexed-access-type-node source-file)))

(defn text
  (^js [indexed-access-type-node]
   (.getText ^js indexed-access-type-node))
  (^js [indexed-access-type-node source-file]
   (.getText ^js indexed-access-type-node source-file)))

(defn first-token
  (^js [indexed-access-type-node]
   (.getFirstToken ^js indexed-access-type-node))
  (^js [indexed-access-type-node source-file]
   (.getFirstToken ^js indexed-access-type-node source-file)))

(defn last-token
  (^js [indexed-access-type-node]
   (.getLastToken ^js indexed-access-type-node))
  (^js [indexed-access-type-node source-file]
   (.getLastToken ^js indexed-access-type-node source-file)))

(defn for-each-child
  (^js [indexed-access-type-node cb-node]
   (.forEachChild ^js indexed-access-type-node cb-node))
  (^js [indexed-access-type-node cb-node cb-node-array]
   (.forEachChild ^js indexed-access-type-node cb-node cb-node-array)))

(defn decorators
  ^js [indexed-access-type-node]
  (.-decorators ^js indexed-access-type-node))

(defn modifiers
  ^js [indexed-access-type-node]
  (.-modifiers ^js indexed-access-type-node))

(defn pos
  ^js [indexed-access-type-node]
  (.-pos ^js indexed-access-type-node))

(defn end
  ^js [indexed-access-type-node]
  (.-end ^js indexed-access-type-node))

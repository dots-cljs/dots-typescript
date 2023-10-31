(ns dots.typescript.template-literal-type-node)

(defn kind
  ^js [template-literal-type-node]
  (.-kind ^js template-literal-type-node))

(defn set-kind!
  ^js [template-literal-type-node value]
  (set! (.-kind ^js template-literal-type-node) value))

(defn head
  ^js [template-literal-type-node]
  (.-head ^js template-literal-type-node))

(defn template-spans
  ^js [template-literal-type-node]
  (.-templateSpans ^js template-literal-type-node))

(defn flags
  ^js [template-literal-type-node]
  (.-flags ^js template-literal-type-node))

(defn parent
  ^js [template-literal-type-node]
  (.-parent ^js template-literal-type-node))

(defn source-file
  ^js [template-literal-type-node]
  (.getSourceFile ^js template-literal-type-node))

(defn child-count
  (^js [template-literal-type-node]
   (.getChildCount ^js template-literal-type-node))
  (^js [template-literal-type-node source-file]
   (.getChildCount ^js template-literal-type-node source-file)))

(defn child-at
  (^js [template-literal-type-node index]
   (.getChildAt ^js template-literal-type-node index))
  (^js [template-literal-type-node index source-file]
   (.getChildAt ^js template-literal-type-node index source-file)))

(defn children
  (^js [template-literal-type-node]
   (.getChildren ^js template-literal-type-node))
  (^js [template-literal-type-node source-file]
   (.getChildren ^js template-literal-type-node source-file)))

(defn start
  (^js [template-literal-type-node]
   (.getStart ^js template-literal-type-node))
  (^js [template-literal-type-node source-file]
   (.getStart ^js template-literal-type-node source-file))
  (^js [template-literal-type-node source-file include-js-doc-comment?]
   (.getStart ^js template-literal-type-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [template-literal-type-node]
  (.getFullStart ^js template-literal-type-node))

(defn get-end
  ^js [template-literal-type-node]
  (.getEnd ^js template-literal-type-node))

(defn width
  (^js [template-literal-type-node]
   (.getWidth ^js template-literal-type-node))
  (^js [template-literal-type-node source-file]
   (.getWidth ^js template-literal-type-node source-file)))

(defn full-width
  ^js [template-literal-type-node]
  (.getFullWidth ^js template-literal-type-node))

(defn leading-trivia-width
  (^js [template-literal-type-node]
   (.getLeadingTriviaWidth ^js template-literal-type-node))
  (^js [template-literal-type-node source-file]
   (.getLeadingTriviaWidth ^js template-literal-type-node source-file)))

(defn full-text
  (^js [template-literal-type-node]
   (.getFullText ^js template-literal-type-node))
  (^js [template-literal-type-node source-file]
   (.getFullText ^js template-literal-type-node source-file)))

(defn text
  (^js [template-literal-type-node]
   (.getText ^js template-literal-type-node))
  (^js [template-literal-type-node source-file]
   (.getText ^js template-literal-type-node source-file)))

(defn first-token
  (^js [template-literal-type-node]
   (.getFirstToken ^js template-literal-type-node))
  (^js [template-literal-type-node source-file]
   (.getFirstToken ^js template-literal-type-node source-file)))

(defn last-token
  (^js [template-literal-type-node]
   (.getLastToken ^js template-literal-type-node))
  (^js [template-literal-type-node source-file]
   (.getLastToken ^js template-literal-type-node source-file)))

(defn for-each-child
  (^js [template-literal-type-node cb-node]
   (.forEachChild ^js template-literal-type-node cb-node))
  (^js [template-literal-type-node cb-node cb-node-array]
   (.forEachChild ^js template-literal-type-node cb-node cb-node-array)))

(defn decorators
  ^js [template-literal-type-node]
  (.-decorators ^js template-literal-type-node))

(defn modifiers
  ^js [template-literal-type-node]
  (.-modifiers ^js template-literal-type-node))

(defn pos
  ^js [template-literal-type-node]
  (.-pos ^js template-literal-type-node))

(defn end
  ^js [template-literal-type-node]
  (.-end ^js template-literal-type-node))

(ns dots.typescript.object-literal-expression-base
  "This interface is a base interface for ObjectLiteralExpression and JSXAttributes to extend from. JSXAttributes is similar to
   ObjectLiteralExpression in that it contains array of properties; however, JSXAttributes' properties can only be
   JSXAttribute or JSXSpreadAttribute. ObjectLiteralExpression, on the other hand, can only have properties of type
   ObjectLiteralElement (e.g. PropertyAssignment, ShorthandPropertyAssignment etc.)")

(defn properties
  ^js [object-literal-expression-base]
  (.-properties ^js object-literal-expression-base))

(defn kind
  ^js [object-literal-expression-base]
  (.-kind ^js object-literal-expression-base))

(defn flags
  ^js [object-literal-expression-base]
  (.-flags ^js object-literal-expression-base))

(defn parent
  ^js [object-literal-expression-base]
  (.-parent ^js object-literal-expression-base))

(defn source-file
  ^js [object-literal-expression-base]
  (.getSourceFile ^js object-literal-expression-base))

(defn child-count
  (^js [object-literal-expression-base]
   (.getChildCount ^js object-literal-expression-base))
  (^js [object-literal-expression-base source-file]
   (.getChildCount ^js object-literal-expression-base source-file)))

(defn child-at
  (^js [object-literal-expression-base index]
   (.getChildAt ^js object-literal-expression-base index))
  (^js [object-literal-expression-base index source-file]
   (.getChildAt ^js object-literal-expression-base index source-file)))

(defn children
  (^js [object-literal-expression-base]
   (.getChildren ^js object-literal-expression-base))
  (^js [object-literal-expression-base source-file]
   (.getChildren ^js object-literal-expression-base source-file)))

(defn start
  (^js [object-literal-expression-base]
   (.getStart ^js object-literal-expression-base))
  (^js [object-literal-expression-base source-file]
   (.getStart ^js object-literal-expression-base source-file))
  (^js [object-literal-expression-base source-file include-js-doc-comment?]
   (.getStart ^js object-literal-expression-base source-file include-js-doc-comment?)))

(defn full-start
  ^js [object-literal-expression-base]
  (.getFullStart ^js object-literal-expression-base))

(defn get-end
  ^js [object-literal-expression-base]
  (.getEnd ^js object-literal-expression-base))

(defn width
  (^js [object-literal-expression-base]
   (.getWidth ^js object-literal-expression-base))
  (^js [object-literal-expression-base source-file]
   (.getWidth ^js object-literal-expression-base source-file)))

(defn full-width
  ^js [object-literal-expression-base]
  (.getFullWidth ^js object-literal-expression-base))

(defn leading-trivia-width
  (^js [object-literal-expression-base]
   (.getLeadingTriviaWidth ^js object-literal-expression-base))
  (^js [object-literal-expression-base source-file]
   (.getLeadingTriviaWidth ^js object-literal-expression-base source-file)))

(defn full-text
  (^js [object-literal-expression-base]
   (.getFullText ^js object-literal-expression-base))
  (^js [object-literal-expression-base source-file]
   (.getFullText ^js object-literal-expression-base source-file)))

(defn text
  (^js [object-literal-expression-base]
   (.getText ^js object-literal-expression-base))
  (^js [object-literal-expression-base source-file]
   (.getText ^js object-literal-expression-base source-file)))

(defn first-token
  (^js [object-literal-expression-base]
   (.getFirstToken ^js object-literal-expression-base))
  (^js [object-literal-expression-base source-file]
   (.getFirstToken ^js object-literal-expression-base source-file)))

(defn last-token
  (^js [object-literal-expression-base]
   (.getLastToken ^js object-literal-expression-base))
  (^js [object-literal-expression-base source-file]
   (.getLastToken ^js object-literal-expression-base source-file)))

(defn for-each-child
  (^js [object-literal-expression-base cb-node]
   (.forEachChild ^js object-literal-expression-base cb-node))
  (^js [object-literal-expression-base cb-node cb-node-array]
   (.forEachChild ^js object-literal-expression-base cb-node cb-node-array)))

(defn pos
  ^js [object-literal-expression-base]
  (.-pos ^js object-literal-expression-base))

(defn end
  ^js [object-literal-expression-base]
  (.-end ^js object-literal-expression-base))

(ns dots.typescript.flow-start)

(defn node
  "**Returns:** `GetAccessorDeclaration | SetAccessorDeclaration | ArrowFunction | FunctionExpression | MethodDeclaration | undefined`"
  ^js [flow-start]
  (.-node ^js flow-start))

(defn set-node!
  ^js [flow-start value]
  (set! (.-node ^js flow-start) value))

(defn flags
  "**Returns:** `FlowFlags`"
  ^js [flow-start]
  (.-flags ^js flow-start))

(defn set-flags!
  ^js [flow-start value]
  (set! (.-flags ^js flow-start) value))

(defn id
  "**Returns:** `number | undefined`"
  ^js [flow-start]
  (.-id ^js flow-start))

(defn set-id!
  ^js [flow-start value]
  (set! (.-id ^js flow-start) value))

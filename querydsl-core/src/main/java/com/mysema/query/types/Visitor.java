/*
 * Copyright (c) 2009 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query.types;

import com.mysema.query.types.custom.CBoolean;
import com.mysema.query.types.custom.CComparable;
import com.mysema.query.types.custom.CDate;
import com.mysema.query.types.custom.CDateTime;
import com.mysema.query.types.custom.CSimple;
import com.mysema.query.types.custom.CString;
import com.mysema.query.types.custom.CTime;
import com.mysema.query.types.custom.Custom;
import com.mysema.query.types.expr.Constant;
import com.mysema.query.types.expr.EArrayConstructor;
import com.mysema.query.types.expr.EBooleanConst;
import com.mysema.query.types.expr.EConstructor;
import com.mysema.query.types.expr.EDateConst;
import com.mysema.query.types.expr.EDateTimeConst;
import com.mysema.query.types.expr.ENumberConst;
import com.mysema.query.types.expr.EStringConst;
import com.mysema.query.types.expr.ETimeConst;
import com.mysema.query.types.expr.ExprConst;
import com.mysema.query.types.operation.OBoolean;
import com.mysema.query.types.operation.OComparable;
import com.mysema.query.types.operation.ODate;
import com.mysema.query.types.operation.ODateTime;
import com.mysema.query.types.operation.ONumber;
import com.mysema.query.types.operation.OSimple;
import com.mysema.query.types.operation.OString;
import com.mysema.query.types.operation.OTime;
import com.mysema.query.types.path.PArray;
import com.mysema.query.types.path.PBoolean;
import com.mysema.query.types.path.PCollection;
import com.mysema.query.types.path.PComparable;
import com.mysema.query.types.path.PDate;
import com.mysema.query.types.path.PDateTime;
import com.mysema.query.types.path.PEntity;
import com.mysema.query.types.path.PList;
import com.mysema.query.types.path.PMap;
import com.mysema.query.types.path.PNumber;
import com.mysema.query.types.path.PSet;
import com.mysema.query.types.path.PSimple;
import com.mysema.query.types.path.PString;
import com.mysema.query.types.path.PTime;
import com.mysema.query.types.query.ListSubQuery;
import com.mysema.query.types.query.ObjectSubQuery;
import com.mysema.query.types.query.SubQuery;

/**
 * Visitor provides a dispatching Visitor for Expr instances.
 * 
 * @author tiwe
 * @version $Id$
 */
public interface Visitor {
    
    void visit(SubQuery query);
    
    void visit(ObjectSubQuery<?> expr);
    
    void visit(ListSubQuery<?> expr);
      
    void visit(CBoolean expr);

    void visit(CComparable<?> expr);
    
    void visit(CDate<?> expr);
    
    void visit(CDateTime<?> expr);
    
    void visit(CTime<?> expr);

    void visit(CSimple<?> expr);

    void visit(CString expr);

    void visit(Custom<?> expr);

    void visit(Constant<?> expr);

    void visit(EArrayConstructor<?> expr);
    
    void visit(EDateConst expr);
    
    void visit(EDateTimeConst expr);
    
    void visit(ENumberConst<?> expr);
    
    void visit(EStringConst expr);
    
    void visit(EBooleanConst expr);
    
    void visit(EConstructor<?> expr);
    
    void visit(ExprConst<?> expr);
    
    void visit(ETimeConst expr);

    void visit(OBoolean expr);

    void visit(OComparable<?, ?> expr);
    
    void visit(ODate<?, ?> expr);
    
    void visit(ODateTime<?, ?> expr);
    
    void visit(OTime<?, ?> expr);

    void visit(ONumber<?, ?> expr);
    
    void visit(OSimple<?, ?> expr);

    void visit(OString expr);

    void visit(PArray<?> expr);

    void visit(PBoolean expr);

    void visit(PComparable<?> expr);

    void visit(PEntity<?> expr);

    void visit(PCollection<?> expr);

    void visit(PList<?, ?> expr);

    void visit(PSet<?> expr);

    void visit(PMap<?, ?, ?> expr);

    void visit(PNumber<?> expr);
    
    void visit(PSimple<?> expr);

    void visit(PString expr);

    void visit(PDate<?> expr);
    
    void visit(PDateTime<?> expr);
    
    void visit(PTime<?> expr);
}

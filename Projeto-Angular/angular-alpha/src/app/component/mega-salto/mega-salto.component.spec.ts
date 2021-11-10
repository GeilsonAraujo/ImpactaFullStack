import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MegaSaltoComponent } from './mega-salto.component';

describe('MegaSaltoComponent', () => {
  let component: MegaSaltoComponent;
  let fixture: ComponentFixture<MegaSaltoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MegaSaltoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MegaSaltoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
